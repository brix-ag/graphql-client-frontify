package ch.brix.gql.client.frontify.builders;

public class RootMutation_createExternalAsset extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.CreateExternalAsset> {
  public RootMutation_createExternalAsset() {
    super(new ch.brix.gql.client.Call<>("createExternalAsset", "CreateExternalAsset"));
  }
  public RootMutation_createExternalAsset args(RootMutation_createExternalAsset_Args argsBuilder) {
    _set_args(argsBuilder);
    return this;
  }
  public RootMutation_createExternalAsset onCreateExternalAsset(On_CreateExternalAsset typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
