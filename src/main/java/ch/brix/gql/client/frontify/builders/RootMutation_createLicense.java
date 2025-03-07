package ch.brix.gql.client.frontify.builders;

public class RootMutation_createLicense extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.CreateLicense> {
  public RootMutation_createLicense() {
    super(new ch.brix.gql.client.Call<>("createLicense", "CreateLicense"));
  }
  public RootMutation_createLicense args(RootMutation_createLicense_Args argsBuilder) {
    _set_args(argsBuilder);
    return this;
  }
  public RootMutation_createLicense onCreateLicense(On_CreateLicense typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
