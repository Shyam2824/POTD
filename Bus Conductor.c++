class Solution {
  public:
    int findMoves(int n, vector<int> chairs, vector<int> passengers) {
               std::sort(chairs.begin(), chairs.end());
     std::sort(passengers.begin(), passengers.end());

    int moves = 0;
    for (int i = 0; i < n; i++) {
        int diff = std::abs(chairs[i] - passengers[i]);
        moves += diff;
    }

    return moves;
    }
};