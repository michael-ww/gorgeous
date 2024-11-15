package gorgeous.algorithm;

public class HuaweiCliming {

    public int count_climbable(int[] hill_map, int strength) {
        if (hill_map == null || hill_map.length <= 0 || strength <= 0) {
            return 0;
        }

        int answer = 0;
        for (int i = 0; i < hill_map.length; i++) {
            if (hill_map[i] == 0) {
                answer += this.count_climbable_left(hill_map, i, i - 1, strength - 2 * hill_map[i - 1]);
                answer += this.count_climbable_right(hill_map, i, i + 1, strength - 2 * hill_map[i + 1]);
            }
        }
        return answer;
    }

    private int count_climbable_left(int[] hill_map, int startIndex, int currentIndex, int leftStrength) {
        if (currentIndex < 0 || currentIndex >= hill_map.length || currentIndex >= startIndex || leftStrength < 0) {
            return 0;
        }
        if (hill_map[currentIndex] == 0 && leftStrength >= 0) {
            return 1;
        }
        if (currentIndex > 0) {
            if (hill_map[currentIndex] > hill_map[currentIndex - 1]) {
                return this.count_climbable_left(hill_map, startIndex, currentIndex - 1,
                        leftStrength - (hill_map[currentIndex] - hill_map[currentIndex - 1])) + 1;
            } else {
                return this.count_climbable_left(hill_map, startIndex, currentIndex - 1,
                        leftStrength - 2 * (hill_map[currentIndex - 1] - hill_map[currentIndex]));
            }
        } else {
            return 0;
        }
    }

    private int count_climbable_right(int[] hill_map, int startIndex, int currentIndex, int leftStrength) {
        if (currentIndex < 0 || currentIndex >= hill_map.length || currentIndex <= startIndex || leftStrength < 0) {
            return 0;
        }
        if (hill_map[currentIndex] == 0 && leftStrength >= 0) {
            return 1;
        }

        if (currentIndex < hill_map.length - 1) {
            if (hill_map[currentIndex] > hill_map[currentIndex + 1]) {
                return this.count_climbable_left(hill_map, startIndex, currentIndex + 1,
                        leftStrength - (hill_map[currentIndex] - hill_map[currentIndex - 1])) + 1;
            } else {
                return this.count_climbable_left(hill_map, startIndex, currentIndex - 1,
                        leftStrength - 2 * (hill_map[currentIndex + 1] - hill_map[currentIndex]));
            }
        } else {
            return 0;
        }
    }

    public static class ClimingInfo {
        private boolean reached;
        private int peakCount;

        public ClimingInfo() {
            this.reached = false;
            this.peakCount = 0;
        }

        public boolean isReached() {
            return reached;
        }

        public void setReached(boolean reached) {
            this.reached = reached;
        }

        public int getPeakCount() {
            return peakCount;
        }

        public void setPeakCount(int peakCount) {
            this.peakCount = peakCount;
        }

    }
}
