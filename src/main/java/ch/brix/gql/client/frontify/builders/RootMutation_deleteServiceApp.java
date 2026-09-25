package ch.brix.gql.client.frontify.builders;

public class RootMutation_deleteServiceApp extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.DeleteServiceApp> {
  public RootMutation_deleteServiceApp() {
    super(new ch.brix.gql.client.Call<>("deleteServiceApp", "DeleteServiceApp"));
  }
  public RootMutation_deleteServiceApp args(RootMutation_deleteServiceApp_Args argsBuilder) {
    _set_args(argsBuilder);
    return this;
  }
  public RootMutation_deleteServiceApp onDeleteServiceApp(On_DeleteServiceApp typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
