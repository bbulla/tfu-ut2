#!/bin/bash

echo "🔑 Request SIN token (esperado: 401 Unauthorized)"
curl -i http://localhost:8080/orders

echo -e "\n\n✅ Request CON token válido"
curl -i -H "Authorization: Bearer <TOKEN_VALIDO>" http://localhost:8080/orders
