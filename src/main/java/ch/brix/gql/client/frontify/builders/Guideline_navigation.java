package ch.brix.gql.client.frontify.builders;

public class Guideline_navigation extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.GuidelineNavigationItems> {
  public Guideline_navigation() {
    super(new ch.brix.gql.client.Call<>("navigation", "GuidelineNavigationItems"));
  }
  public Guideline_navigation args(Guideline_navigation_Args argsBuilder) {
    _set_args(argsBuilder);
    return this;
  }
  public Guideline_navigation onGuidelineNavigationItems(On_GuidelineNavigationItems typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
