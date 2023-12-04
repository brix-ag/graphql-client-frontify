package ch.brix.gql.client.frontify.builders;

public class VideoMarking_timeframe extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.MarkingTimeframe> {
  public VideoMarking_timeframe() {
    super(new ch.brix.gql.client.Call<>("timeframe", "MarkingTimeframe"));
  }
  public VideoMarking_timeframe onMarkingTimeframe(On_MarkingTimeframe typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
