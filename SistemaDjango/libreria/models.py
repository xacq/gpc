from django.db import models

# Create your models here.
class Dato(models.Model):
    Direction = models.TextField()
    Year = models.TextField()
    Date = models.DateField()
    Weekday = models.TextField()
    Country = models.TextField()
    Commodity = models.TextField()
    Transport_Mode = models.TextField()
    Measure = models.TextField()
    Value = models.IntegerField()
    Cumulative = models.IntegerField()
    