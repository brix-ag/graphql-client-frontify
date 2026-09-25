package ch.brix.gql.client.frontify.builders;

public class RootMutation_addLibraryAssetTargets extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.AddLibraryAssetTargets> {
  public RootMutation_addLibraryAssetTargets() {
    super(new ch.brix.gql.client.Call<>("addLibraryAssetTargets", "AddLibraryAssetTargets"));
  }
  public RootMutation_addLibraryAssetTargets args(RootMutation_addLibraryAssetTargets_Args argsBuilder) {
    _set_args(argsBuilder);
    return this;
  }
  public RootMutation_addLibraryAssetTargets onAddLibraryAssetTargets(On_AddLibraryAssetTargets typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
