from django.contrib import admin

from django.contrib import admin
from .models import Tank, Equipment

@admin.register(Tank)
class TankAdmin(admin.ModelAdmin):
    list_display = ('id', 'name', 'country', 'weight', 'speed_in_kmph', 'armor_thickness', 'firepower')
    search_fields = ('name', 'country')

@admin.register(Equipment)
class EquipmentAdmin(admin.ModelAdmin):
    list_display = ('id', 'name', 'type')
    search_fields = ('name', 'type')
