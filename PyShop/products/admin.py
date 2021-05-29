from django.contrib import admin
from .models import Product, Offs

# generamos esta clase para solicitar de los campos de los modelos.py que se muestren en la vista de productos
# ingresados


class OffsAdmin(admin.ModelAdmin):
    list_display = ('code', 'discount')


class ProductAdmin(admin.ModelAdmin):
    list_display = ('name', 'price', 'stock')


# permite generar productos nuevos dentro del servidor llamando a la clase anteriormente creada
admin.site.register(Product, ProductAdmin)


admin.site.register(Offs, OffsAdmin)



