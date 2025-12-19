import {todayResponse} from "../types/todayResponse"

const BASE = "/matteo"

export async function getToday(): Promise<Checklist> {
  const res = await fetch(BASE + "/today");
  if (!res.ok) {
    throw new Error("Failed to load checklists");
  }
  return res.json();
}
