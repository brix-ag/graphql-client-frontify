package ch.brix.gql.client.frontify.builders;

public class RootQuery_guidelinePage extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.GuidelinePage> {
  public RootQuery_guidelinePage() {
    super(new ch.brix.gql.client.Call<>("guidelinePage", "GuidelinePage"));
  }
  public RootQuery_guidelinePage args(RootQuery_guidelinePage_Args argsBuilder) {
    _set_args(argsBuilder);
    return this;
  }
  public RootQuery_guidelinePage onGuidelinePage(On_GuidelinePage typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
