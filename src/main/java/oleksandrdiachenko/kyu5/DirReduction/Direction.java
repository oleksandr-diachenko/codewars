package oleksandrdiachenko.kyu5.DirReduction;

/**
 * @author : Oleksandr Diachenko
 * @since : 7/30/2020
 **/
public enum Direction implements Opposite {

    NORTH {
        @Override
        public Direction getOpposite() {
            return SOUTH;
        }
    },
    SOUTH {
        @Override
        public Direction getOpposite() {
            return NORTH;
        }
    },
    WEST {
        @Override
        public Direction getOpposite() {
            return EAST;
        }
    },
    EAST {
        @Override
        public Direction getOpposite() {
            return WEST;
        }
    }
}
