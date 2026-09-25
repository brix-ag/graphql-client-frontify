package ch.brix.gql.client.frontify.builders;

public class MediaLibrary_assetsByExternalId extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.LibraryAssetsByExternalIdResult> {
  public MediaLibrary_assetsByExternalId() {
    super(new ch.brix.gql.client.Call<>("assetsByExternalId", "LibraryAssetsByExternalIdResult"));
  }
  public MediaLibrary_assetsByExternalId args(MediaLibrary_assetsByExternalId_Args argsBuilder) {
    _set_args(argsBuilder);
    return this;
  }
  public MediaLibrary_assetsByExternalId onLibraryAssetsByExternalIdResult(On_LibraryAssetsByExternalIdResult typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
