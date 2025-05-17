from rest_framework import serializers
from .models import Tank, Equipment

class TankSerializer(serializers.ModelSerializer):
    class Meta:
        model = Tank
        fields = '__all__'

class EquipmentSerializer(serializers.ModelSerializer):
    class Meta:
        model = Equipment
        fields = '__all__'
