1. What are the key and value types? Why is the name useful as a key?
  - The key is a String and the value is the Pokemon object. It is useful as a key because we use the Pokemon's name to search.

2. Using the provided hash() method and % 11, show the bucket calculation for two names that collided. Must their full hash codes match?
  - 973379043 % 11 = 10
  - 1366001581 % 11 = 10
  - They both end up in bucket 10 so therefore there is a collision. No there has codes do not need to match. 

3. Trace how get() finds the second name in that chain. What causes it to stop?
  - Bucket 10: bulbasaur --> squirtle --> null

    Searches for squirtle
    It checks if "squirtle".equals("bulbasaur") match but it doesn't so it moves on
    It goes to the the next node
    "squirtle".equals("squirtle") match so squirtle is found
    Returns he object

4. Why does insert() update an existing key instead of adding a duplicate? What changes when remove() deletes the first node?
  - The insert() updates an existing key instead of duplicating it is because the Pokemon name should only be used once in the hash table.
  - The remove() deletes the first node, and then the second node is now the first node. 

5. What happens to lookup work when many names land in one bucket?
  - The more the names in the bucket the more nodes it has to search through to find the node it is looking for.

6. How does Pokemon.equals() differ from ==? Why does Pokemon need a matching hashCode(), and which class's hashCode() does this table use for its keys?
  - So the "==" checks to see if two things are the exact same thing.
  - The equals() checks to see if two objects have the same information. 
