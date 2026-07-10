package ch.brix.gql.client.frontify.builders;

public class AssetRevisionItems_items extends ch.brix.gql.client.CallBuilder<java.util.List<ch.brix.gql.client.frontify.objects.AssetRevision>> {
  public AssetRevisionItems_items() {
    super(new ch.brix.gql.client.Call<>("items", "AssetRevision"));
  }
  public AssetRevisionItems_items onAssetRevision(On_AssetRevision typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
