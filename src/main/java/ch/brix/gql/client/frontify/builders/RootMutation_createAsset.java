package ch.brix.gql.client.frontify.builders;

public class RootMutation_createAsset extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.CreateAsset> {
  public RootMutation_createAsset() {
    super(new ch.brix.gql.client.Call<>("createAsset", "CreateAsset"));
  }
  public RootMutation_createAsset args(RootMutation_createAsset_Args argsBuilder) {
    _set_args(argsBuilder);
    return this;
  }
  public RootMutation_createAsset onCreateAsset(On_CreateAsset typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
