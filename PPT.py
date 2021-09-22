import random

def jugar():
    usuario = input("Piedra(R) - Papel(P) - Tijera(T)\n").lower()
    maquina = random.choice(['r', 'p', 't'])
    if usuario == maquina:
        return 'Empate...!'
    elif ganador_si(usuario, maquina):
        return f"Ganaste! Maquina escogio {maquina}"
    return f"Perdiste! Maquina escogio {maquina}"


def ganador_si(player, opponent):
    if player == 'r' and opponent == 's':
        print("Roca golpea a tijera")
        return True
    elif player == 't' and opponent == 'p':
        print("Tijera corta papel")
        return True
    elif player == 'p' and opponent == 'r':
        print("Papel envuelve a roca")
        return True


print(jugar())
