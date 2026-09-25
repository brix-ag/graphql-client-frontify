package ch.brix.gql.client.frontify.builders;

public class Video_targets extends ch.brix.gql.client.CallBuilder<java.util.List<ch.brix.gql.client.frontify.objects.Target>> {
  public Video_targets() {
    super(new ch.brix.gql.client.Call<>("targets", "Target"));
  }
  public Video_targets onTarget(On_Target typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
