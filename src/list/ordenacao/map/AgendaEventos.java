package list.ordenacao.map;
import java.time.LocalDate;
import java.time.Month;
import java.util.Map;
import java.util.HashMap;
import java.util.TreeMap;

public class AgendaEventos
{
    private final Map<LocalDate, Evento> eventosMap;


    public AgendaEventos()
    {
        this.eventosMap = new HashMap<>();
    }


    public void adicionarEvento(LocalDate data, Evento evento)
    {
        eventosMap.put(data, evento);
    }


    public void exibirAgenda()
    {
        System.out.println(new TreeMap<>(eventosMap));
    }


    public void obterProximoEvento()
    {
        LocalDate dataAtual = LocalDate.now();
        for (Map.Entry<LocalDate, Evento> entry : eventosMap.entrySet())
        {
            if
            (
                entry.getKey().isEqual(dataAtual) ||
                entry.getKey().isAfter(dataAtual)
            )
            {
                System.out.printf("O peóximo evento %s acontecerá em %s%n",
                        entry.getValue(),
                        entry.getKey());
                break;
            }
        }
    }


    public static void main(String[] args)
    {
        AgendaEventos agendaEventos = new AgendaEventos();

        agendaEventos.adicionarEvento(
                LocalDate.of(2020, Month.DECEMBER, 24),
                new Evento("Evento 1", "Atração 1")
        );
        agendaEventos.adicionarEvento(
                LocalDate.of(2024, Month.JULY, 15),
                new Evento("Evento 2", "Atração 2")
        );
        agendaEventos.adicionarEvento(
                LocalDate.of(2024, Month.AUGUST, 12),
                new Evento("Evento 3", "Atração 3")
        );

        agendaEventos.exibirAgenda();
        agendaEventos.obterProximoEvento();

    }
}
