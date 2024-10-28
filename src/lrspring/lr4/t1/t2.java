package lrspring.lr4.t1;

@Service
public class FirstService implements ModifyRequestService {

    @Override
    public void modifySource(Request request, String newSource) {
        request.setSource(newSource);
    }
}