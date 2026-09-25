package ch.brix.gql.client.frontify.builders;

public class RootMutation_removeAssetRelations extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.RemoveAssetRelations> {
  public RootMutation_removeAssetRelations() {
    super(new ch.brix.gql.client.Call<>("removeAssetRelations", "RemoveAssetRelations"));
  }
  public RootMutation_removeAssetRelations args(RootMutation_removeAssetRelations_Args argsBuilder) {
    _set_args(argsBuilder);
    return this;
  }
  public RootMutation_removeAssetRelations onRemoveAssetRelations(On_RemoveAssetRelations typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
