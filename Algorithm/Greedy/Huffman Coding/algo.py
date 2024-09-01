import heapq
from collections import defaultdict, Counter

class Node:
    def __init__(self, freq, char=None, left=None, right=None):
        self.freq = freq
        self.char = char
        self.left = left
        self.right = right

    def __lt__(self, other):
        return self.freq < other.freq

def build_huffman_tree(text):
    frequency = Counter(text)
    heap = [Node(freq, char) for char, freq in frequency.items()]
    heapq.heapify(heap)

    while len(heap) > 1:
        left = heapq.heappop(heap)
        right = heapq.heappop(heap)
        merged = Node(left.freq + right.freq, left=left, right=right)
        heapq.heappush(heap, merged)

    return heap[0]

def build_codes(node, prefix='', code_map={}):
    if node.char:
        code_map[node.char] = prefix
    else:
        build_codes(node.left, prefix + '0', code_map)
        build_codes(node.right, prefix + '1', code_map)
    return code_map

def huffman_encoding(text):
    root = build_huffman_tree(text)
    huffman_code = build_codes(root)
    return huffman_code

if __name__ == "__main__":
    text = "huffman coding is a data compression algorithm"
    huffman_code = huffman_encoding(text)
    for char, code in huffman_code.items():
        print(f"{char}: {code}")
