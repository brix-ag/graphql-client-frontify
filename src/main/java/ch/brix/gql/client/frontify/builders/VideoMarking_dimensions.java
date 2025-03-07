package ch.brix.gql.client.frontify.builders;

public class VideoMarking_dimensions extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.MarkingDimensions> {
  public VideoMarking_dimensions() {
    super(new ch.brix.gql.client.Call<>("dimensions", "MarkingDimensions"));
  }
  public VideoMarking_dimensions onMarkingDimensions(On_MarkingDimensions typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
