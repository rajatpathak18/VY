ALTER TABLE vy_address CHANGE `address` `address_line1` varchar(2000);
ALTER TABLE vy_address CHANGE `alternate_address` `alternate_address_line1` varchar(2000);
ALTER TABLE vy_address ADD `address_line2` varchar(2000) DEFAULT NULL;
ALTER TABLE vy_address ADD `alternate_address_line2` varchar(2000) DEFAULT NULL;