package ch.brix.gql.client.frontify.builders;

public class CreateServiceApp_serviceApp extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.ServiceApp> {
  public CreateServiceApp_serviceApp() {
    super(new ch.brix.gql.client.Call<>("serviceApp", "ServiceApp"));
  }
  public CreateServiceApp_serviceApp onServiceApp(On_ServiceApp typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
