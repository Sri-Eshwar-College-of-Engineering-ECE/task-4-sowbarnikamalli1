-- Create Database
CREATE DATABASE payment_gateway;

-- Connect to database
-- (Run this command in PostgreSQL after creating the database)
-- \c payment_gateway;

-- Users Table
CREATE TABLE users (
    id SERIAL PRIMARY KEY,
    name VARCHAR(50) NOT NULL,
    email VARCHAR(100) UNIQUE NOT NULL,
    password VARCHAR(100) NOT NULL,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

-- Transactions Table
CREATE TABLE transactions (
    id SERIAL PRIMARY KEY,
    sender_id INT,
    receiver_id INT,
    amount DECIMAL(10,2) NOT NULL,
    status VARCHAR(20) DEFAULT 'SUCCESS',
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,

    CONSTRAINT fk_sender
        FOREIGN KEY(sender_id)
        REFERENCES users(id),

    CONSTRAINT fk_receiver
        FOREIGN KEY(receiver_id)
        REFERENCES users(id)
);