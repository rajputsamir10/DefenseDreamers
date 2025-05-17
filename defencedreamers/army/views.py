from django.shortcuts import render

from rest_framework import generics
from .models import Tank, Equipment
from .serializers import TankSerializer, EquipmentSerializer

# List and Create Tanks
class TankListCreateAPIView(generics.ListCreateAPIView):
    queryset = Tank.objects.all()
    serializer_class = TankSerializer

# Retrieve, Update, and Delete a single Tank
class TankRetrieveUpdateDestroyAPIView(generics.RetrieveUpdateDestroyAPIView):
    queryset = Tank.objects.all()
    serializer_class = TankSerializer
    lookup_field = 'id'

# List and Create Equipment
class EquipmentListCreateAPIView(generics.ListCreateAPIView):
    queryset = Equipment.objects.all()
    serializer_class = EquipmentSerializer

# Retrieve, Update, and Delete a single Equipment
class EquipmentRetrieveUpdateDestroyAPIView(generics.RetrieveUpdateDestroyAPIView):
    queryset = Equipment.objects.all()
    serializer_class = EquipmentSerializer
    lookup_field = 'id'
