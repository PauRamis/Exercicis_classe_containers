import java.util.*;


public class Containers {
    public static void main(String[] args) {
        System.out.println("--- LListes1 ---");
        llistes1();
        System.out.println("--- Iterators ---");
        iterators();
        System.out.println("--- Cua ---");
        cues();
        System.out.println("--- Piles ---");
        piles();
        System.out.println("--- Conjunts ---");
        conjunts();
        System.out.println("--- Mapes ---");
        mapes();

    }

    static void llistes1() {
        // Crea llista d'enters anomenada "l1"
        List<Integer> l1 = new ArrayList<Integer>();

        // Afegeix els números 10, 20 i 15
        java.util.Collections.addAll(l1, 10, 20, 15);

        // Imprimeix la llista
        System.out.println("l1 = " + l1.toString());

        // Elimina el segon element
        l1.remove(1);

        // Imprimeix la llista
        System.out.println("l1 = " + l1.toString());

        // Crea llista d'enters anomenada "l2"
        List<Integer> l2 = new ArrayList<Integer>();

        // Afegeix els números 3, 6 i 9
        java.util.Collections.addAll(l2, 3, 6, 9);

        // Afegeix la llista l1 a la llista l2
        l2.addAll(l1);

        // Imprimeix la llista l2
        System.out.println("l2 = " + l2.toString());

        // Elimina tots els valors de l1
        l1.removeAll(l1);

        // Afegeix els tres primers elements de l2 a l1
        l1.addAll(l2.subList(0, 3));

        // Comprova si dins l1 hi ha el número 6
        System.out.println("l2 " + (l1.contains(6) ? "conté" : "no conté") + " el 6");

        // Afegeix el numero 6 un altre cop a l1 al principi de la llista
        l1.add(0, 6);

        // Cerca la posicio de l'element que te el numero 9 a la llista l1
        System.out.println("la posició del 9 és " + l1.indexOf(9));

        // A l1, substitueix l'element a la posició 1 per el valor 5
        l1.set(1, 5);

        // A l1, insereix a la posició 2 l'element 4
        l1.add(2, 4);

        // Imprimeix la llista l1
        System.out.println("l1 = " + l1.toString());

        // Converteix l1 a array i imprimeix-ho
        Integer[] ar = l1.toArray(new Integer[0]);
    }

    static void iterators() {
        // Crea llista d'enters anomenada "l1"
        List<Integer> l1 = new ArrayList<Integer>();

        // Afegeix a l1 els elements 10, 20, 50 i 90
        java.util.Collections.addAll(l1, 10, 20, 50, 90);

        // Treu Iterator (it)
        Iterator<Integer> it = l1.iterator();

        // Mentre hi hagi element següent, imprimeix l'element
        while (it.hasNext()) {
            Integer n = it.next();
            System.out.println(n);
        }
        // Torna a crear l'objecte iterator i has de recórrer la llista, però has d'esborrar l'element "50"
        it = l1.iterator();
        while (it.hasNext()) {
            if (it.next() == 50) {
                it.remove();
            }
        }

        // Imprimeix la llista
        System.out.println(l1);

        // Crea un ListIterator de la llista l1 (anomenat "li")
        ListIterator<Integer> li = l1.listIterator();

        // Avança l'iterador fins al final de la llista
        while (li.hasNext()) {
            li.next();
        }

        // Recorre la llista al reves amb l'iterador, imprimint els elements
        while (li.hasPrevious()) {
            System.out.println(li.previous());
        }

        // Torna a recorrer la llista amb l'iterador, pero aquest cop imprimeix tambe l'index de l'element
        while (li.hasNext()) {
            System.out.printf("Index: %d, Element: %d\n" + li.nextIndex(), li.next());
        }

    }

    static void cues() {
        // Declara una cua (anomenada "cua") com una LinkedList
        Queue<Integer> queue = new LinkedList<>();

        // Afegeix els elements 12, 14 i 99 a la cua
        queue.offer(12);
        queue.offer(14);
        queue.offer(99);

        // Mostra el primer element (sense treurer-lo) de la cúa i imprimeix-ho
        System.out.println(queue.peek());

        // Treu el primer element de la cúa
        queue.poll();

        // Imprimeix la cúa
        System.out.println(queue);

        // Declara una cúa de prioritat anomenada "cuaPrioritat"
        Queue<Integer> cuaPrioritat = new PriorityQueue<Integer>();

        // Afegeix els elements 5, 2, -1, 9 i 7
        cuaPrioritat.addAll(List.of(5, 2, -1, 9, 7));

        // Imprimeix la cúa
        System.out.println(cuaPrioritat);

        // Fes un bucle que vagi traient cada element i l'imprimeixi de la cúa de prioritat, mentre en quedin
        while (cuaPrioritat.size() > 0) {
            System.out.println(cuaPrioritat.poll());
        }
    }

    static void piles() {
        // Declara una pila (stack) com una LinkedList
        LinkedList<Integer> stack = new LinkedList<>();

        // Push a la pila dels valors 15, 56, 21 i -5
        stack.push(15);
        stack.push(56);
        stack.push(21);
        stack.push(-5);

        // Imprimeix la pila
        System.out.println(stack);

        // Imprimeix el valor de damunt la pila, sense treurer-lo
        System.out.println(stack.peek());

        // Treu i imprimeix els valors de la pila
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }

    static void conjunts() {
        // Declara un conjunt d'enters anomenat "set"
        Set<Integer> set = new HashSet<>();

        // Afegeix els elements 14, 6 i 3
        set.addAll(List.of(15, 6, 3));

        // Imprimeix el conjunt
        System.out.println(set);

        // Afegeix l'element 6 un altre cop
        set.add(6);

        // Imprimeix el conjunt
        System.out.println(set);

        // Construeix un conjunt de caràcters anomenat set2 (Usa la class Character, no char)
        // i introdueix totes les lletres de la paraula "ESTERNOCLEIDOMASTOIDEO"
        // Després, imprimeix el conjunt
        Set<Character> set2 = new HashSet<>();
        String s = "ESTERNOCLEIDOMASTOIDEO";
        for (char c : s.toCharArray()) {
            set2.add(c);
        }
        System.out.println(set2);

        // Empra un iterador (it) per recórrer tot el conjunt de caràcters anterior
        // i imprimeix element a element
        Iterator<Character> it = set2.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

    static void mapes() {
        // Construeix un mapa (map) que associi un String amb un altre String

        // Introdueix el parell: "RENAULT" - "CLIO"

        // Introdueix el parell: "VOLKSWAGEN" - "GOLF"

        // Introdueix el parell: "PEUGEOT" - "308"

        // Introdueix el parell: "HONDA" - "CIVIC"

        // Introdueix el parell: "PEUGEOT" - "RCZ"

        // Imprimeix el mapa


        // Treu el conjunt de claus del mapa (variable kset)

        // Imprimeix aquest conjunt

        // Treu el valor de la clau "PEUGEOT" i imprimeix-ho

        // Mitjançant un iterador, imprimeix tots els parells clau-valor del mapa


        // Empra un mapa que associi un caràcter a un número enter per dur el compte
        // de quantes vegades surt cada lletra a la paraula "ESTERNOCLEIDOMASTOIDEO"


    }
}

