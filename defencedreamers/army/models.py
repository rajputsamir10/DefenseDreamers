from django.db import models

class Tank(models.Model):
    name = models.TextField()
    country = models.CharField(max_length=100)
    weight = models.TextField()
    speed_in_kmph= models.FloatField()
    armor_thickness = models.TextField(max_length=200)
    firepower = models.TextField(max_length=100)

    def __str__(self):
        return self.name


class Equipment(models.Model):
    name = models.CharField(max_length=100)
    information = models.TextField()
    type = models.CharField(max_length=50)

    def __str__(self):
        return self.name
