package days.year2022

import days.Day


fun main() {
    println(Day22().solve())
}


class Day22 : Day(22) {

    fun solve(): Any {
        val sides = inputList.splitBy { it == "" }.map { it.map { it.toMutableList() }.toMutableList() }.toMutableList()
        val SIZE = sides[0].size


        sides[1] = transposeMatrix(sides[1]).toMutableMatrix()
        sides[1] = sides[1].map{it.reversed()}.toMutableMatrix()

        sides[4] = transposeMatrix(sides[4]).toMutableMatrix()
        sides[4] = sides[4].map{it.reversed()}.toMutableMatrix()

        sides[5] = transposeMatrix(sides[5]).toMutableMatrix()
        sides[5] = sides[5].map{it.reversed()}.toMutableMatrix()

//        val instructionsS = "10R5L5R10L4R5L5"
        val instructionsS = "39L35R25L7R47L28R8L33R20R40R33R11L32L6L14R9R13R49L32R24R40R49L8R7L28L7L34R12R29L12R25R26L7R33L18R25L32L29R13L8R4R42L24L23L8L50L9L46R10L47L17L16R44L4L18L43R26L16R3R25L33L50R42L13R16L32R46R19R50R40R19R8L4R1L39L26R14L27R22R48L21R16R14R44L32L1L6R26L3L24R11L15R43R34L2L2L15R16R12R29R40L32L36L20L22L43R50L38R44L41L22L32L13R42L10R18L48R45L24R15L22L20R5R37R30L22R13L7R31L8L38R3R13L14R28L28R17R27L40R5L24R20L11R27R4R29R25R11L21L21R39R44R15L46L23L6L40R31L40R15R48R33R22R6L50R18L16R22R14L50R39L16L32R49R3R43L8R13R30L28R13R33L39R43R4R24R39R19L35L38R43L10L8L34R14L3R13L45R38R30R27L25R25R35L43R21R11L10L33L40R23R40L39R6R4R22R33L29L13R42L28R32R13R12R16L7L46L44L16L25L22R9L2R13R35R42L28R49L49R15L49R2R21L26L47R4L31R22L9L32L16R10L46L31R39L25R11R42R32L17R12L38L20L45L8L22L43R41L13R40L46R9L13L42L13R36R6R8R31L20R5R6L9L36L50L17L23R5R4R34R28R14R38L48R11L26R4R19L47R25R9L37L22L30R10R14L24R12L13R1L27L6L35L42L38R38L11L26L15L31R19R5L50L7R30L49R10R14L13L1R15R7R2R9R30L34R7R10R46R15R9R29L29R13L27L27L36L22L14L7R6R44R5L28R11R36R39R25L39R39L7L32R2L12R48R23L3R35L14R2R28R29R5R6L7L17L22R39L48R34L6R35L38R48R6L33L20R15R24L22L16R1L7R40R25R34L42L13R23L18L17L38L25R12R28R4L40L49R25R48R9L19R21L49L26L23R43L6L38L41R44R30R3R38L46L30L47L1R40R18L43L2L11L10L22L22R22R33L12L12R25R36R35L47R9R40L37R49R13L13R50R28R18L30R16R6R40L4L30R8R49R33R31L27L9R27R3R47L15R47R39L20L27L21R38L48R35R10R36L48L47R29L2R39R3R6R49R14R29R48R47L6L27L20R17L42R2R8L48L3L48R13R41R45L42L6R33R9L31R38L47L28R29R39R46R43R22R12R10R33R23L31L6L12L49R35L8R21L39R29L34R40L17R33R38L23R45R30L30R41L18L12L20L2L33L40R50L28R19L10L20R11R15R14L39R21L28R10R19L21L16R37R1R16R26R39L4R31R40L31R21R46L37L25L17L9R16L12R19L28R14R13L22L50R6R23R2L40L9R8R7R24L29R30L28R26L4R43L33R21R46R32L41R10R48R25R2L6L28L3R32R11R27R49L8R49R39R36R35R32L14R34L23L22L38L41R28R1R35L2R23L14R34R30L30R45L29L38L7R14R33R22R36L36L15L25R1R6R3L32R40R15L10R5L30L33R46R44L48R16R47L48R12R13L35L48L24L7L3L50L44L35R44L45L6R10L17L20L8L33R40L49R19L35L33L46L26R12R35L12R36L7R18R27R36R25R8L7R40L15L16L45R44R25R17R40R19R23R16L22R26R40R22R6L21L45L27R29L34R36L24L48R17R11L43L2L49R45R23L49L36R40R33L16R48R33R11R42R35R30R11R48R18R20R37L43L5L47R41L46R4R1R30R23L38L6R8L18R47L3R48R35L31R5L45R30R18R50L7L5L49R9R4R3R1L4R37R18L19L46L49L24R28L23R47L25R15L22R40R29R13R23R11L46R34R40L38L12R7L23R46R7L44L22L43R26L39R30L4L14L33L20R21R19L15L13R34R24R6L9L3L42R24R50R14R49L38L14L26R35R39R33L20R17R17R43R38L28R12L18R18R15L41L49L13R13L29R2L20L50R32L25L19L14R15R29L15R29L30L17L44L30R8L26R35R32R15R47L30R5R30L14R49L42R22L8L18R26L44R43R17L27R24R28R44L22L9L6R19L29L3L9L9R50R34R23R29L20R26L15R27L9L27R39L5L49R19L20L28L40L6R11L48L30L21L33R13L38R10R35R38L7R43L33R33R4R34R23L8L27R45L43R3R31L5R13L41R37L23L28R10R39L12R27L37L45L39R40R41R22L9R3R5L47L20L36R10L49R3R36L40L48R41L24L7L48R47R24R37R23L23R19R48R5L43R36R12L45L47R7L41L23R50R14L4R46L47L10R12L47R13R18R15R7R45L35L34L35R39L27L33R28L20L24R38R33R23L2R19L31R11L4R1R42L8R36R17L49L45R35L39L32L16R19R15L7R42L39L14R29R8L44R28R24L3L17R4R5L28R19R48L33L42R17R28L14L35L9R27R9R28R47L47L42L20L2L1R32L38L1L8L21R17L28R42R46R31L34R27R26L17R23R25L20R16L21R1L48R11R22R35R49L42R5L24R11R18L12L5L21R25R14R16L50L32R47R41R15R43R8R28L24L16R29R17L32R1R11L37R26R13L44L43R44L28R33R36L28R34R20L39L47L18R37L4L10L38R20R23L22L10L2L21L14L23L23R39R14R48R1L20R21L47R21R46R13L36L16L39R2R30L17R19L15L3R2R34R22R31L24R18R26L16L25R27L21R21R19L39R20L41L28L43L25R36R38L36L23R6L12L38L45R29L32R47R18R45L20R18R20L12R9R49L17R46R42L1L16R6L31L35R24L18L26R11R39L25R40R21R5R15R25L31L14L48L7R6R7R9R18R23L48R4L24L5L37L33L5L16R18L25R48R16L50R46R9R9R25R4L19L9L33R31L45L45R17L38L30L22L25L49R21R45L14L17L12R33R18R22L50R18L5R25L35R10R8R10R14L29L20L31R8L45L19R32L41R48L33L48L42L31R49L48L8L45L19R42R12L29R26L44L49R38L40R24L37R9L44R21L13R13R19R26L42L20L13R39R27R14L43L42L47L15R1R32L22R47R35R46L24L9R25L6R26L17R6L29L47R10L8L28R33L6R9R29L31L39L23R6L34L10R20L35L35R48R13L44L4L48L2R30L40L24L49R39R39R45L7L33R39L15R28R47R35L25R25R13L45L50L43R31L47L38L38R34L26R5L15L20L25L40L42L11L33L4R37R11R26L12L29L11R12R50R46L1R15L34L17R16R11L39L45R21L5L43R41R48R14L32L28R47L46L43L26R47R9L6R33R3R3L22R16L37L49L40L23L25L11L36L22R34L22R34L35R27L9R29R20R9R34R29R20L13L24R10R8R45L29R21L46R45R38L16L9L10R30R50L2R30L22R31L11L23L10L23R16R33R48L49R11L6R36R49R26L34R44R28R23R16L31L4L19L16R27R15L39L42R21R34R34L34L42R28L37R18R30L36R20R17R36R39L49L25R22L4L34L36R10L49R48R2R24L8L21R8R38R15L47L11R14R5R14R47L6R28R3L14R11R36R2R18L12L36R35R14R50L38L25R6L41L17R18L9R44R34L42L50R17R6L4L25R32L8L38R30L50R9L39L4R9R27L39L14L45R40R19R48R42L10L34R44L41L24R17L9L14L40L3L48L6R44R48L48L5R13L11L9L27L37R40R39L35L19L1L22L17L46R41L15R15L37R20L44L25R14L18L48L28R22L30L29R20R42L38L39L44R16L26L50R47L30R23L41L39R10R30L50R1L46L41R8L12R10L45L20R6R9R45R19L40R44R38R12R42R18R10R5L39R4R3R4R16L35R40R36R5L31R28L17R18L28R23R37R10L7R23R9L49R42L47L3L17L39R34L24L30R9R7L13L18L31L38L8L48L22L4R44R13L47R18R35L40L48R39L47R26R31L25L28L36L8R26R10R7L23L21R46L30L1R13L17L9R13R20R1L36L36L33L34R8R31L4L1L20R15L30R50R50L7R50R45L40L20R41R47R14L18L25R6R9R11R3L1R30R21L4R2L33R14L1R42R41L37R5R4R26R31R34R22R24R39R9R15R19L34L9R38L43R38L30L48R49R42L8L23R28R8R2R2L1L16R2L1L10R1R45R45L39L3L4R12L50R29R14R26L15L35L33R9L3R39L27L50R47L45R34R38L36R25L34R14L15L13L31R30R24L40R8R18R18R7L36L9R49R15L44R11L17R33R34L39L19R30R21L18L38R43L5R16R44R19R39R43L37R45R19R46R21L24L3L3R20L26L19R27R39R15R8R15L43R25L45L20L17R49R10R33R24R26R10L39L31L30R5L11L49L32R43L22L9R5L47L21L37R39L32L1L18L34L31R34R25R15R24L30L8R48R13R13L15R41L15L45R6R10L6R48R47R10R34L25R8L11L3R5R46R33R22R41R23R38L49L9L14L1R23L20R48L43L26L39R32R17R39R50L19R48R3R46L1L14L11R1R12R48R37L33L22L18R25R9L32R37L14R36L40L24L23R11L1R26R27R44L32R32L38L18R26L10R7L26R25L42R17R37L10L24L33R15L9L14R19R46L50L29L16R42R46R25L30L6R16R39R2R9L30R5L9L2L24R41"

        val instructions = Regex("(?<=[RL])|(?=[RL])").split(instructionsS)

        val sidesList = listOf('T', 'R', 'F', 'D', 'L', 'B')
        val sidesMap = mapOf(Pair('T', 0), Pair('R', 1), Pair('F', 2), Pair('D', 3), Pair('L', 4), Pair('B', 5))

        var side = 0
        val startX = sides[side][1].indexOf('.')
        var location = Point(1, startX)
        var direction = '>'

        for (instruction in instructions) {
            var grid = sides[side]
            if (isNumeric(instruction)) {
                var i = 0
                while (i < instruction.toInt()) {
                    i++
                    if (direction == '>') {
                        val next = grid[location.y][location.x + 1]
                        if (next == '.') location.move('R')
                        if (next == '#') break
                        if (next == 'X') {
                            when (sidesList[side]) {
                                'F' -> {
                                    val ngrid = sides[sidesMap['R']!!]
                                    if (ngrid[location.y][1] == '#') break
                                    else {
                                        side = sidesMap['R']!!
                                        grid=ngrid
                                        location.x = 1
                                    }
                                }


                                'R' -> {
                                    val ngrid = sides[sidesMap['B']!!]
                                    if (ngrid[location.y][1] == '#') break
                                    else {
                                        side = sidesMap['B']!!
                                        grid=ngrid
                                        location.x = 1
                                    }
                                }

                                'B' -> {
                                    val ngrid = sides[sidesMap['L']!!]
                                    if (ngrid[location.y][1] == '#') break
                                    else {
                                        side = sidesMap['L']!!
                                        grid=ngrid
                                        location.x = 1
                                    }
                                }

                                'L' -> {
                                    val ngrid = sides[sidesMap['F']!!]
                                    if (ngrid[location.y][1] == '#') break
                                    else {
                                        side = sidesMap['F']!!
                                        grid=ngrid
                                        location.x = 1
                                    }
                                }

                                'T' -> {
                                    val ngrid = sides[sidesMap['R']!!]
                                    if (ngrid[1][SIZE-location.y-1] == '#') break
                                    else {
                                        side = sidesMap['R']!!
                                        grid=ngrid
                                        location.x = SIZE-location.y-1
                                        location.y = 1
                                        direction='v'
                                    }
                                }

                                'D' -> {
                                    val ngrid = sides[sidesMap['R']!!]
                                    if (ngrid[SIZE-2][location.y] == '#') break
                                    else {
                                        side = sidesMap['R']!!
                                        grid=ngrid
                                        location.x = location.y
                                        location.y = SIZE-2
                                        direction='^'
                                    }
                                }
                            }
                        }
                    }

                    else if (direction == '<') {
                        val next = grid[location.y][location.x - 1]
                        if (next == '.') location.move('L')
                        if (next == '#') break
                        if ( next == 'X') {
                            when (sidesList[side]) {
                                'F' -> {
                                    val ngrid = sides[sidesMap['L']!!]
                                    if (ngrid[location.y][SIZE-2] == '#') break
                                    else {
                                        side = sidesMap['L']!!
                                        grid=ngrid
                                        location.x = SIZE-2
                                    }
                                }


                                'L' -> {
                                    val ngrid = sides[sidesMap['B']!!]
                                    if (ngrid[location.y][SIZE-2] == '#') break
                                    else {
                                        side = sidesMap['B']!!
                                        grid=ngrid
                                        location.x = SIZE-2
                                    }
                                }

                                'B' -> {
                                    val ngrid = sides[sidesMap['R']!!]
                                    if (ngrid[location.y][SIZE-2] == '#') break
                                    else {
                                        side = sidesMap['R']!!
                                        grid=ngrid
                                        location.x = SIZE-2
                                    }
                                }

                                'R' -> {
                                    val ngrid = sides[sidesMap['F']!!]
                                    if (ngrid[location.y][SIZE-2] == '#') break
                                    else {
                                        side = sidesMap['F']!!
                                        grid=ngrid
                                        location.x = SIZE-2
                                    }
                                }

                                'T' -> {
                                    val ngrid = sides[sidesMap['L']!!]
                                    if (ngrid[1][location.y] == '#') break
                                    else {
                                        side = sidesMap['L']!!
                                        grid=ngrid
                                        location.x = location.y
                                        location.y = 1
                                        direction='v'
                                    }
                                }

                                'D' -> {
                                    val ngrid = sides[sidesMap['L']!!]
                                    if (ngrid[SIZE-2][SIZE-location.y-1] == '#') break
                                    else {
                                        side = sidesMap['L']!!
                                        grid=ngrid
                                        location.x = SIZE-location.y-1
                                        location.y = SIZE-2
                                        direction='^'
                                    }
                                }
                            }
                        }
                    }

                    else if (direction == '^') {
                        val next = grid[location.y - 1][location.x]
                        if (next == '.') location.move('U')
                        if (next == '#') break
                        if (next == 'X') {
                            when (sidesList[side]) {
                                'T' -> {
                                    val ngrid = sides[sidesMap['B']!!]
                                    if (ngrid[1][SIZE-location.x-1] == '#') break
                                    else {
                                        side = sidesMap['B']!!
                                        grid=ngrid
                                        location.x = SIZE-location.x-1
                                        location.y = 1
                                        direction='v'
                                    }
                                }

                                'F' -> {
                                    val ngrid = sides[sidesMap['T']!!]
                                    if (ngrid[SIZE-2][location.x] == '#') break
                                    else {
                                        side = sidesMap['T']!!
                                        grid=ngrid
                                        location.y = SIZE-2
                                    }
                                }

                                'D' -> {
                                    val ngrid = sides[sidesMap['F']!!]
                                    if (ngrid[SIZE-2][location.x] == '#') break
                                    else {
                                        side = sidesMap['F']!!
                                        grid=ngrid
                                        location.y = SIZE-2
                                    }
                                }

                                'B' -> {
                                    val ngrid = sides[sidesMap['T']!!]
                                    if (ngrid[1][SIZE-location.x-1] == '#') break
                                    else {
                                        side = sidesMap['T']!!
                                        grid=ngrid
                                        location.x=SIZE-location.x-1
                                        location.y = 1
                                        direction = 'v'
                                    }
                                }

                                'L' -> {
                                    val ngrid = sides[sidesMap['T']!!]
                                    if (ngrid[location.x][1] == '#') break
                                    else {
                                        side = sidesMap['T']!!
                                        grid=ngrid
                                        location.y = location.x
                                        location.x = 1
                                        direction = '>'
                                    }
                                }

                                'R' -> {
                                    val ngrid = sides[sidesMap['T']!!]
                                    if (ngrid[SIZE - location.x - 1][SIZE-2] == '#') break
                                    else {
                                        side = sidesMap['T']!!
                                        grid=ngrid
                                        location.y = SIZE - location.x - 1
                                        location.x = SIZE-2
                                        direction = '<'
                                    }
                                }
                            }
                        }
                    }

                    else if (direction == 'v') {
                        val next = grid[location.y + 1][location.x]
                        if (next == '.') location.move('D')
                        if (next == '#') break
                        if (next == 'X') {
                            when (sidesList[side]) {
                                'T' -> {
                                    val ngrid = sides[sidesMap['F']!!]
                                    if (ngrid[1][location.x] == '#') break
                                    else {
                                        side = sidesMap['F']!!
                                        grid=ngrid
                                        location.y = 1
                                    }
                                }

                                'F' -> {
                                    val ngrid = sides[sidesMap['D']!!]
                                    if (ngrid[1][location.x] == '#') break
                                    else {
                                        side = sidesMap['D']!!
                                        grid=ngrid
                                        location.y = 1
                                    }
                                }

                                'D' -> {
                                    val ngrid = sides[sidesMap['B']!!]
                                    if (ngrid[SIZE-2][SIZE-location.x-1] == '#') break
                                    else {
                                        side = sidesMap['B']!!
                                        grid=ngrid
                                        location.x = SIZE-location.x-1
                                        location.y = SIZE-2
                                        direction = '^'
                                    }
                                }

                                'B' -> {
                                    val ngrid = sides[sidesMap['D']!!]
                                    if (ngrid[SIZE-2][SIZE-location.x-1] == '#') break
                                    else {
                                        side = sidesMap['D']!!
                                        grid=ngrid
                                        location.x=SIZE-location.x-1
                                        location.y = SIZE-2
                                        direction = '^'

                                    }
                                }

                                'L' -> {
                                    val ngrid = sides[sidesMap['D']!!]
                                    val ny = SIZE-location.x-1
                                    if (ngrid[ny][1] == '#') break
                                    else {
                                        side = sidesMap['D']!!
                                        grid=ngrid
                                        location.y = ny
                                        location.x = 1
                                        direction = '>'
                                    }
                                }

                                'R' -> {
                                    val ngrid = sides[sidesMap['D']!!]
                                    val nx = SIZE-2
                                    if (ngrid[location.x][nx] == '#') break
                                    else {
                                        side = sidesMap['D']!!
                                        grid=ngrid
                                        location.y = location.x
                                        location.x = nx
                                        direction = '<'
                                    }
                                }
                            }

                        }
                    }
                }

            } else {
                direction = turn(direction, instruction == "R")
            }
            println(instruction)
            println(sidesList[side])

            sides[side].print(location, direction)

        }



        println("END side: $side direction: $direction  location: $location  size:$SIZE")

        return 1;
    }

    private fun turn(direction: Char, moveRight: Boolean): Char {
        var nDirection = 'X'
        if (direction == '>') {
            if (moveRight) nDirection = 'v'
            else nDirection = '^'
        }

        if (direction == '<') {
            if (moveRight) nDirection = '^'
            else nDirection = 'v'
        }

        if (direction == '^') {
            if (moveRight) nDirection = '>'
            else nDirection = '<'
        }

        if (direction == 'v') {
            if (moveRight) nDirection = '<'
            else nDirection = '>'
        }

        return nDirection
    }


}
