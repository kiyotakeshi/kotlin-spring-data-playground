package com.kiyotakeshi.springdataplayground.repository

import com.kiyotakeshi.springdataplayground.entity.Seat
import org.springframework.data.jpa.repository.JpaRepository

interface SeatRepository : JpaRepository<Seat?, Int?>
