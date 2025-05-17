from django.urls import path
from .views import (
    TankListCreateAPIView,
    TankRetrieveUpdateDestroyAPIView,
    EquipmentListCreateAPIView,
    EquipmentRetrieveUpdateDestroyAPIView
)

urlpatterns = [
    path('tanks/', TankListCreateAPIView.as_view(), name='tank-list-create'),
    path('tanks/<int:id>/', TankRetrieveUpdateDestroyAPIView.as_view(), name='tank-detail'),
    
    path('equipment/', EquipmentListCreateAPIView.as_view(), name='equipment-list-create'),
    path('equipment/<int:id>/', EquipmentRetrieveUpdateDestroyAPIView.as_view(), name='equipment-detail'),
]
# This code defines the URL patterns for the army app in a Django project. It includes paths for listing, creating, retrieving, updating, and deleting tanks and equipment. The views are handled by class-based views that are imported from the views module. The URL patterns are defined using the path function, which maps URLs to their corresponding views. The urlpatterns list is then used by Django to route incoming requests to the appropriate view based on the URL.
# The urlpatterns list is used by Django to route incoming requests to the appropriate view based on the URL. The TankListCreateAPIView and EquipmentListCreateAPIView handle listing and creating tanks and equipment, respectively, while the TankRetrieveUpdateDestroyAPIView and EquipmentRetrieveUpdateDestroyAPIView handle retrieving, updating, and deleting individual tank and equipment records.