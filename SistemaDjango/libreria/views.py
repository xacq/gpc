from django.shortcuts import render
from . models import Dato
# Create your views here.

def home (request):
    datos = Dato.objects.all()[:40]
    return render(request,"visual.html",{'informacion' : datos})