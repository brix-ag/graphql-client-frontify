package ch.brix.gql.client.frontify.builders;

public class RootMutation_deleteLicense extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.DeleteLicense> {
  public RootMutation_deleteLicense() {
    super(new ch.brix.gql.client.Call<>("deleteLicense", "DeleteLicense"));
  }
  public RootMutation_deleteLicense args(RootMutation_deleteLicense_Args argsBuilder) {
    _set_args(argsBuilder);
    return this;
  }
  public RootMutation_deleteLicense onDeleteLicense(On_DeleteLicense typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
