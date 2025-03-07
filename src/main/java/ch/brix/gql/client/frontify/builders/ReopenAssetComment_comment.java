package ch.brix.gql.client.frontify.builders;

public class ReopenAssetComment_comment extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.AssetComment> {
  public ReopenAssetComment_comment() {
    super(new ch.brix.gql.client.Call<>("comment", "AssetComment"));
  }
  public ReopenAssetComment_comment onAssetComment(On_AssetComment typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
