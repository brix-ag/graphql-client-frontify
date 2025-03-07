package ch.brix.gql.client.frontify.builders;

public class RootMutation_addAssetRelations extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.AddAssetRelations> {
  public RootMutation_addAssetRelations() {
    super(new ch.brix.gql.client.Call<>("addAssetRelations", "AddAssetRelations"));
  }
  public RootMutation_addAssetRelations args(RootMutation_addAssetRelations_Args argsBuilder) {
    _set_args(argsBuilder);
    return this;
  }
  public RootMutation_addAssetRelations onAddAssetRelations(On_AddAssetRelations typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
