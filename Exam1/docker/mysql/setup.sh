echo "====>run mysql script..."
mysql -u root -p root
source sakila-schema.sql
source sakila-data.sql