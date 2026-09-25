package ch.brix.gql.client.frontify.builders;

public class RootMutation_createServiceApp extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.CreateServiceApp> {
  public RootMutation_createServiceApp() {
    super(new ch.brix.gql.client.Call<>("createServiceApp", "CreateServiceApp"));
  }
  public RootMutation_createServiceApp args(RootMutation_createServiceApp_Args argsBuilder) {
    _set_args(argsBuilder);
    return this;
  }
  public RootMutation_createServiceApp onCreateServiceApp(On_CreateServiceApp typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
