package ch.brix.gql.client.frontify.builders;

public class ServiceAppItems_items extends ch.brix.gql.client.CallBuilder<java.util.List<ch.brix.gql.client.frontify.objects.ServiceApp>> {
  public ServiceAppItems_items() {
    super(new ch.brix.gql.client.Call<>("items", "ServiceApp"));
  }
  public ServiceAppItems_items onServiceApp(On_ServiceApp typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
