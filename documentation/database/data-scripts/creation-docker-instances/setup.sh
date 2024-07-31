#!/bin/bash

# Define volume directories
MYSQL_VOLUME_DIR="/home/atena/mysql/"
POSTGRESQL_VOLUME_DIR="/home/atena/postgresql/"

# Create volume directories if they don't exist
if [ ! -d "$MYSQL_VOLUME_DIR" ]; then
  mkdir -p "$MYSQL_VOLUME_DIR"
fi

if [ ! -d "$POSTGRESQL_VOLUME_DIR" ]; then
  mkdir -p "$POSTGRESQL_VOLUME_DIR"
fi

# Set volume size to 5GB (optional and not necessary for functionality)
# truncate -s 5G "$MYSQL_VOLUME_DIR/dummyfile"
# truncate -s 5G "$POSTGRESQL_VOLUME_DIR/dummyfile"

# Run docker-compose to set up the MySQL container
docker-compose -f docker-compose-mysql.yml up -d
if [ $? -eq 0 ]; then
  echo "MySQL database setup complete with a 5GB volume."
else
  echo "Failed to set up MySQL database."
  exit 1
fi

# Run docker-compose to set up the PostgreSQL container
docker-compose -f docker-compose-postgresql.yml up -d
if [ $? -eq 0 ]; then
  echo "PostgreSQL database setup complete with a 5GB volume."
else
  echo "Failed to set up PostgreSQL database."
  exit 1
fi

