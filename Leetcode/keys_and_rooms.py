# https://leetcode.com/problems/keys-and-rooms/
'''
    Author - Subhajit Das
    University of Engineering and Management, Kolkata
    13/10/2019
'''


class Solution(object):
    def canVisitAllRooms(self, rooms):
        """
        :type rooms: List[List[int]]
        :rtype: bool
        """
        self.n = len(rooms)

        self.visited = [False]*self.n

        self.dfsRoomSearch(rooms, 0)

        return self.visited.count(False) == 0

    def dfsRoomSearch(self, rooms, roomNo):
        self.visited[roomNo] = True

        for key in rooms[roomNo]:
            if(not self.visited[key] and key != roomNo):
                self.dfsRoomSearch(rooms, key)
