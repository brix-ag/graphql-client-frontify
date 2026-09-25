package ch.brix.gql.client.frontify.builders;

public class RootMutation_setLibraryAssetTargets extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.SetLibraryAssetTargets> {
  public RootMutation_setLibraryAssetTargets() {
    super(new ch.brix.gql.client.Call<>("setLibraryAssetTargets", "SetLibraryAssetTargets"));
  }
  public RootMutation_setLibraryAssetTargets args(RootMutation_setLibraryAssetTargets_Args argsBuilder) {
    _set_args(argsBuilder);
    return this;
  }
  public RootMutation_setLibraryAssetTargets onSetLibraryAssetTargets(On_SetLibraryAssetTargets typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
