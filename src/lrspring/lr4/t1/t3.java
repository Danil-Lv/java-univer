package lrspring.lr4.t1;

@RestController
@RequestMapping("/api")
public class MyController {

    @Autowired
    private FirstService firstService;

    @PutMapping("/modify-source/{id}")
    public Response modifySource(@PathVariable Long id, @RequestParam String newSource) {
        Request request = new Request(); // Получение текущего запроса
        firstService.modifySource(request, newSource);
        return new Response("Источник был изменён на: " + newSource);
    }
}