package ch.brix.gql.client.frontify.builders;

public class Library_assetsByExternalId extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.LibraryAssetsByExternalIdResult> {
  public Library_assetsByExternalId() {
    super(new ch.brix.gql.client.Call<>("assetsByExternalId", "LibraryAssetsByExternalIdResult"));
  }
  public Library_assetsByExternalId args(Library_assetsByExternalId_Args argsBuilder) {
    _set_args(argsBuilder);
    return this;
  }
  public Library_assetsByExternalId onLibraryAssetsByExternalIdResult(On_LibraryAssetsByExternalIdResult typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
