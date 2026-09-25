package ch.brix.gql.client.frontify.builders;

public class RootQuery_serviceApps extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.ServiceAppItems> {
  public RootQuery_serviceApps() {
    super(new ch.brix.gql.client.Call<>("serviceApps", "ServiceAppItems"));
  }
  public RootQuery_serviceApps args(RootQuery_serviceApps_Args argsBuilder) {
    _set_args(argsBuilder);
    return this;
  }
  public RootQuery_serviceApps onServiceAppItems(On_ServiceAppItems typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
