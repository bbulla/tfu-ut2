#!/bin/bash

echo "🔄 Probando request con reintentos (3 veces si falla)"
curl --retry 3 http://localhost:8080/orders
