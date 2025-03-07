package ch.brix.gql.client.frontify.builders;

public class RootMutation_createAssetComment extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.CreateAssetComment> {
  public RootMutation_createAssetComment() {
    super(new ch.brix.gql.client.Call<>("createAssetComment", "CreateAssetComment"));
  }
  public RootMutation_createAssetComment args(RootMutation_createAssetComment_Args argsBuilder) {
    _set_args(argsBuilder);
    return this;
  }
  public RootMutation_createAssetComment onCreateAssetComment(On_CreateAssetComment typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
