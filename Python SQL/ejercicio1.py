
import pandas as pd

# read the csv file
data = pd.read_csv('carpetas_2022.csv', encoding="utf8")

print("Numero de registros: ", len(data))

print("Numero de columna: ", len(data.axes[1]))

print("Numero de valores nulos por columnas\n ",  data.isnull().sum())

tipos_delitos = data['delito'].unique()
print("***************** TIPOS DE DELITOS REGISTRADOS *****************\n", tipos_delitos)

df_2022_2023 = data[(data['ao_inicio'] == 2022) | (data['ao_inicio'] == 2023)]
delitos_por_alcaldia = df_2022_2023.groupby('alcaldia_hechos')['delito'].count()
delitos_por_alcaldia = delitos_por_alcaldia.sort_values(ascending=False)
alcaldia_max_delitos = delitos_por_alcaldia.idxmax()
print("***************** ALCALDIA CON MAS DELITOS EN 2022 y 2023 *****************\n", alcaldia_max_delitos)

df_xochimilco = data[data['alcaldia_hechos'] == 'XOCHIMILCO']
delitos_por_tipo = df_xochimilco.groupby('delito')['categoria_delito'].count()
delitos_por_tipo = delitos_por_tipo.sort_values(ascending=False)
delito_mas_frecuente = delitos_por_tipo.idxmax()
print("***************** DELITO MAS FRECUENTE EN LA ALCALDIA DE XOCHIMILCO *****************\n", delito_mas_frecuente)

df_iztapalapa_2023 = data[(data['alcaldia_hechos'] == 'IZTAPALAPA') & (data['ao_inicio'] == 2023)]
delitos_por_colonia = df_iztapalapa_2023.groupby('colonia_datos')['categoria_delito'].count()
delitos_por_colonia = delitos_por_colonia.sort_values(ascending=False)
colonia_mas_delitos = delitos_por_colonia.idxmax()
print("***************** COLONIA CON MAS DELITOS DE IZTAPALAPA EN 2023 *****************\n", colonia_mas_delitos)

df_iztapalapa_2023 = data[(data['alcaldia_hechos'] == 'IZTAPALAPA') & (data['ao_inicio']==2023)]
delitos_por_tipo = df_iztapalapa_2023.groupby('delito')['categoria_delito'].sum()
delitos_por_tipo = delitos_por_tipo.sort_values(ascending=False)
delitos_mas_comunes = delitos_por_tipo.head(7)
print("***************** 7 DELITOS MAS COMUNES EN LA COLONIA CON MAS DELITOS DE IZTAPALAPA EN 2023 *****************\n", delitos_mas_comunes)


df_2022 = data[data['ao_inicio']==2022]
df_2022['Mes'] = pd.to_datetime(df_2022['fecha_hechos']).dt.month
delitos_por_mes = df_2022.groupby('Mes')['categoria_delito'].count()
delitos_por_mes = delitos_por_mes.sort_values(ascending=False)
mes_con_mas_delitos = delitos_por_mes.idxmax()
print("***************** EL MES CON MAS DELITOS EN 2022 *****************\n", mes_con_mas_delitos)

alcaldias = data[data['alcaldia_hechos'].isin(['IZTAPALAPA', 'GUSTAVO A MADERO', 'CUAUHTEMOC', 'TLALPAN', 'COYOACAN', 'ALVARO OBREGON', 'TLAHUAC', 'BENITO JUAREZ', 'IZTACALCO', 'MIGUEL HIDALGO', 'VENUSTIANO CARRANZA', 'MILPA ALTA', 'XOCHIMILCO'])]
alcaldias_con_delitos = alcaldias.groupby('alcaldia_hechos')['categoria_delito'].count()
alcaldia_con_menos_delitos = alcaldias_con_delitos.idxmin()
print("***************** LA ALCALDIA CON MENOS DELITOS REGISTROS *****************\n", alcaldia_con_menos_delitos)

df_bigamia = data[data['delito'] == 'BIGAMIA']
alcaldias_con_bigamia = df_bigamia.groupby('alcaldia_hechos')['categoria_delito'].count()
alcaldia_con_mas_bigamia = alcaldias_con_bigamia.idxmax()
print("***************** LA ALCALDIA CON MAYOR DELITO DE BIGAMIA *****************\n", alcaldia_con_mas_bigamia)

delitos_de_extorsion_2022 = data.loc[(data['delito'] == 'EXTORSION') & (data['ao_hechos'] == 2022)]
delitos_de_extorsion_por_alcaldia = delitos_de_extorsion_2022.groupby(['alcaldia_hechos'])['categoria_delito'].count()
alcaldia_con_mas_extorsion = delitos_de_extorsion_por_alcaldia.idxmax()
print("***************** LA ALCALDIA CON MAYOR DELITO DE EXTORCION EN 2022 *****************\n", alcaldia_con_mas_extorsion)

delitos_iztapalapa_2023 = data[(data['alcaldia_hechos'] == 'IZTAPALAPA') & (data['delito'] == 'ROBO A TRANSEUNTE EN VÍA PÚBLICA CON VIOLENCIA') & (data['ao_hechos'] == 2023)]
delitos_iztapalapa_2023['dia'] = pd.to_datetime(delitos_iztapalapa_2023['fecha_hechos']).dt.strftime('%A')
delitos_por_dia = delitos_iztapalapa_2023.groupby('dia')['categoria_delito'].count()
dia_con_mas_delitos = delitos_por_dia.idxmax()
print("***************** DIA DE LA SEMANA DONDE MAS ROBO A TRANSEUNTE EN VÍA PÚBLICA CON VIOLENCIA EN IZTAPALAPA EN 2023 *****************\n", dia_con_mas_delitos)






