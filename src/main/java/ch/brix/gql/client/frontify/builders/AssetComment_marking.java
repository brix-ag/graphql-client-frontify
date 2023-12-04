package ch.brix.gql.client.frontify.builders;

public class AssetComment_marking extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.interfaces.Marking> {
  public AssetComment_marking() {
    super(new ch.brix.gql.client.Call<>("marking", "Marking"));
  }
  public AssetComment_marking onSimpleMarking(On_SimpleMarking typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
  public AssetComment_marking onMultiPageMarking(On_MultiPageMarking typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
  public AssetComment_marking onVideoMarking(On_VideoMarking typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
  public AssetComment_marking onMarking(On_Marking typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
