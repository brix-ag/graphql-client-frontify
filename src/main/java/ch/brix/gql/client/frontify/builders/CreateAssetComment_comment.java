package ch.brix.gql.client.frontify.builders;

public class CreateAssetComment_comment extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.AssetComment> {
  public CreateAssetComment_comment() {
    super(new ch.brix.gql.client.Call<>("comment", "AssetComment"));
  }
  public CreateAssetComment_comment onAssetComment(On_AssetComment typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
