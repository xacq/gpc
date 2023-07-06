
import pandas as pd

# read the csv file
data = pd.read_csv('vgsales.csv', encoding="latin-1")

print("Numero de registros :", len(data))

print("Numero de columna: ", len(data.axes[1]))

print("Numero de valores nulos por columnas\n ",  data.isnull().sum())

data.dropna(subset=['Rank'],inplace=True)
print("Ya no existen valores nulos")

pelicula = data.loc[data['Global_Sales'] == data['Global_Sales'].max()]
print("***************** EL JUEGO MAS VENDIDO *****************\n", pelicula)

sqlsports = data.groupby(["Genre"]).count()
deportes = sqlsports.query("Genre =='Sports'")
print("***************** LA CANTIDAD TOTAL DE JUEGOS DE DEPORTES *****************\n", deportes["Rank"])

sqljapanese = data["JP_Sales"].max()
jpsales = data.query("JP_Sales == @sqljapanese")
print("***************** EL JUEGO MAS VENDIDO EN JAPON *****************\n", jpsales)


jpsalesmin = data.query("JP_Sales == 0")
print("***************** EL JUEGO MENOS VENDIDO EN JAPON *****************\n", jpsalesmin['Name'])

sqldate = data["Year"].min()
date = data.query("Year == @sqldate")
print("***************** LISTA DE JUEGOS VENDIDOS EN EL AÑO:", sqldate ," ****************\n", date['Name'])

promedio_ventas = data.groupby('Platform')['Global_Sales'].mean()
plataforma_mas_vendida = promedio_ventas.idxmax()
print("***************** PLATAFORMA CON MAS VENTAS PROMEDIO EN EL MUNDO *****************\n", plataforma_mas_vendida)

plataforma_mas_vendida = data['Platform'][data['EU_Sales'].idxmax()]
print("***************** PLATAFORMA CON MAS VENTAS PROMEDIO EN EUROPA *****************\n", plataforma_mas_vendida)

df_ventas = data.groupby(['Platform', 'Name'])['Global_Sales'].sum().reset_index()# agrupar por plataforma y juego, y luego sumar las ventas mundiales
df_ventas = df_ventas.sort_values(by='Global_Sales', ascending=False)# ordenar los datos por ventas mundiales en orden descendente
df_top_5 = df_ventas.groupby('Platform').head(5) # seleccionar los 5 juegos más vendidos para cada plataforma
print("***************** LOS 5 JUEGOS MAS VENDIDOS POR PLATAFORMA EN EL MUNDO *****************\n", df_top_5)

df_ventas = data.groupby(['Platform', 'Name'])['Global_Sales'].sum().reset_index()# agrupar por plataforma y juego, y luego sumar las ventas mundiales
df_ventas = df_ventas.sort_values(by='Global_Sales', ascending=True)# ordenar los datos por ventas mundiales en orden descendente
df_top_5 = df_ventas.groupby('Platform').head(5) # seleccionar los 5 juegos más vendidos para cada plataforma
print("***************** LOS 5 JUEGOS MENOS VENDIDOS POR PLATAFORMA EN EL MUNDO *****************\n", df_top_5)

juegos_por_plataforma = data['Platform'].value_counts()
plataforma_max_juegos = juegos_por_plataforma.idxmax()
print("***************** PLATAFORMA CON MAS JUEGOS *****************\n", plataforma_max_juegos)

ventas_por_genero = data.groupby('Genre')['JP_Sales'].sum()
ventas_por_genero = ventas_por_genero.sort_values(ascending=False)
genero_max_ventas = ventas_por_genero.idxmax()
print("***************** EL GENERO DE JUEGOS MAS VENDIDO EN JAPON *****************\n", genero_max_ventas)

ventas_por_genero = data.groupby('Genre')['NA_Sales'].sum()
ventas_por_genero = ventas_por_genero.sort_values(ascending=False)
genero_max_ventas = ventas_por_genero.idxmax()
print("***************** EL GENERO DE JUEGOS MAS VENDIDO EN ESTADOS UNIDOS *****************\n", genero_max_ventas)
