package ch.brix.gql.client.frontify.builders;

public class ResolveAssetComment_comment extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.AssetComment> {
  public ResolveAssetComment_comment() {
    super(new ch.brix.gql.client.Call<>("comment", "AssetComment"));
  }
  public ResolveAssetComment_comment onAssetComment(On_AssetComment typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
